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

**wafw00f** identifies Web Application Firewalls. It sends crafted requests and analyzes responses.

Detection fingerprints WAF products. ModSecurity, Cloudflare, AWS WAF, etc.

Multiple URLs can be tested. Batch processing from file.

All mode tests against every WAF. Thorough but slower.

Proxy support routes through interceptors. Useful with Burp Suite.

# DETECTED WAFS

Cloudflare, AWS WAF, Akamai, F5 BIG-IP, ModSecurity, Imperva, Sucuri, Fortinet, and many more.

# CAVEATS

For authorized testing only. Some WAFs may block detection. False positives possible.

# HISTORY

**wafw00f** was created for web application security testing. It helps penetration testers identify protection measures.

# SEE ALSO

[nmap](/man/nmap)(1), [nikto](/man/nikto)(1), [wfuzz](/man/wfuzz)(1)
