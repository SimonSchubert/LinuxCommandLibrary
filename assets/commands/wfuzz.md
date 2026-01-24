# TLDR

**Fuzz URL parameter**

```wfuzz -c -z file,[wordlist.txt] "[http://target/?param=FUZZ]"```

**Fuzz directory**

```wfuzz -c -z file,[dirs.txt] "[http://target/FUZZ]"```

**POST data fuzzing**

```wfuzz -c -z file,[wordlist.txt] -d "user=admin&pass=FUZZ" "[http://target/login]"```

**Filter by response code**

```wfuzz -c --hc 404 -z file,[wordlist.txt] "[http://target/FUZZ]"```

**Filter by response size**

```wfuzz -c --hl 0 -z file,[wordlist.txt] "[http://target/FUZZ]"```

**Multiple fuzz points**

```wfuzz -c -z file,[users.txt] -z file,[passwords.txt] "[http://target/?u=FUZ2Z&p=FUZZ]"```

# SYNOPSIS

**wfuzz** [_-c_] [_-z type,data_] [_--hc codes_] [_options_] _url_

# PARAMETERS

**-z** _TYPE,DATA_
> Payload specification.

**-c**
> Color output.

**--hc** _CODES_
> Hide response codes.

**--hl** _LINES_
> Hide by line count.

**--hw** _WORDS_
> Hide by word count.

**--hh** _CHARS_
> Hide by char count.

**-d** _DATA_
> POST data.

**-H** _HEADER_
> HTTP header.

**-t** _N_
> Threads.

# DESCRIPTION

**wfuzz** fuzzes web applications. It brute-forces parameters, directories, and more.

FUZZ keyword marks injection point. Payloads replace FUZZ.

Multiple fuzz points use FUZ2Z, FUZ3Z. Combine wordlists.

Filtering hides uninteresting responses. Focus on anomalies.

Payloads include files, ranges, encoders. Flexible input.

# CAVEATS

For authorized testing only. Rate limiting may be needed. Large wordlists are slow.

# HISTORY

**wfuzz** was created by **Christian Martorella** (Edge-Security) for web application testing. It's a standard tool in penetration testing.

# SEE ALSO

[ffuf](/man/ffuf)(1), [gobuster](/man/gobuster)(1), [dirb](/man/dirb)(1)
