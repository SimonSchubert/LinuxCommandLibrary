# TAGLINE

Web Application Firewall detection tool

# TLDR

**Detect WAF**

```wafw00f [https://example.com]```

**Test multiple URLs**

```wafw00f -i [urls.txt]```

**List known WAFs**

```wafw00f -l```

**Verbose output**

```wafw00f -v [https://example.com]```

**Test all WAFs**

```wafw00f -a [https://example.com]```

**Output to file**

```wafw00f -o [output.txt] [https://example.com]```

# SYNOPSIS

**wafw00f** [_-l_] [_-a_] [_-v_] [_options_] _url_

# PARAMETERS

**-l**, **--list**
> List known WAFs.

**-a**, **--findall**
> Test all WAFs.

**-i** _FILE_
> Input file.

**-o** _FILE_
> Output file.

**-v**, **--verbose**
> Verbose output.

**-t** _TEST_
> Specific test.

**-p** _PROXY_
> Use proxy.

# DESCRIPTION

**wafw00f** is a security tool that identifies Web Application Firewalls (WAFs) protecting websites. It works by sending specially crafted HTTP requests and analyzing the responses for signatures and behaviors characteristic of specific WAF products.

The tool can detect a wide range of commercial and open-source WAFs including Cloudflare, AWS WAF, Akamai, F5 BIG-IP, ModSecurity, Imperva, Sucuri, and many others. In its default mode it stops after identifying the first WAF, while the all-detection mode tests against every known WAF fingerprint for thorough analysis.

Multiple URLs can be tested in batch from an input file, and proxy support allows routing traffic through interception tools like Burp Suite. The tool is designed for authorized penetration testing and security assessments to help identify protection measures before deeper testing.

# DETECTED WAFS

Cloudflare, AWS WAF, Akamai, F5 BIG-IP, ModSecurity, Imperva, Sucuri, Fortinet, and many more.

# CAVEATS

For authorized testing only. Some WAFs may block detection. False positives possible.

# HISTORY

**wafw00f** was created for web application security testing. It helps penetration testers identify protection measures.

# SEE ALSO

[nmap](/man/nmap)(1), [nikto](/man/nikto)(1), [wfuzz](/man/wfuzz)(1)
