package orientedtoexpressions.imperative

import java.math.BigInteger

fun validate(iban: String) : Boolean{
    val countryCodes = "AD24 AE23 AL28 AT20 AZ28 BA20 BE16 BG22 BH22 BR29 " +
            "BY28 CH21 CR22 CY28 CZ24 DE22 DK18 DO28 EE20 ES24 FI18 FO18 FR27 " +
            "GB22 GE22 GI23 GL18 GR27 GT28 HR21 HU28 IE22 IL23 IQ23 IS26 IT27 " +
            "JO30 KW30 KZ20 LB28 LC32 LI21 LT20 LU20 LV21 MC27 MD24 ME22 MK19 " +
            "MR27 MT31 MU30 NL18 NO15 PK24 PL28 PS29 PT25 QA29 RO24 RS22 SA24 " +
            "SC31 SE24 SI19 SK24 SM27 ST25 SV28 TL23 TN24 TR26 UA29 VG24 XK20"

    var formattedIBAN = iban.replace(" ", "")

    val countryCode = formattedIBAN.substring(0, 2) + formattedIBAN.length

    if(countryCode !in countryCodes){
        return false
    }

    formattedIBAN = formattedIBAN.substring(4) + formattedIBAN.substring(0, 4)

    for (char in 'A'..'Z'){
        val letter = char.toString()
        val intLetter = (char - 55).toInt()
        formattedIBAN = formattedIBAN.replace(letter, intLetter.toString())
    }

    val mod97 = BigInteger(formattedIBAN) % BigInteger.valueOf(97L)

    return mod97 == BigInteger.ONE
}