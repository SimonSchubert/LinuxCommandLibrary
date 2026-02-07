# TAGLINE

HTTP stress testing tool

# TLDR

**Test** a specific website

```goldeneye.py [url]```

Test with **100 user agents** and **200 concurrent sockets**

```goldeneye.py [url] -u 100 -s 200```

Test without **verifying SSL** certificate

```goldeneye.py [url] -n```

Test in **debug mode**

```goldeneye.py [url] -d```

Display **help**

```goldeneye.py -h```

# SYNOPSIS

**goldeneye.py** _url_ [_options_]

# PARAMETERS

**-u**, **--useragents** _NUM_
> Number of random user agents to use

**-s**, **--sockets** _NUM_
> Number of concurrent sockets

**-w**, **--workers** _NUM_
> Number of workers

**-n**, **--nosslcheck**
> Do not verify SSL certificates

**-d**, **--debug**
> Enable debug output

**-m**, **--method** _METHOD_
> HTTP method: GET, POST, RANDOM

**-h**, **--help**
> Display help message

# DESCRIPTION

**goldeneye.py** is an HTTP stress testing tool designed to test the resilience of web servers and applications against heavy load conditions. It generates concurrent HTTP connections using randomized headers and user agents to simulate traffic patterns and identify performance bottlenecks.

> **WARNING**: This tool is intended ONLY for authorized security testing and load testing of systems you own or have explicit permission to test. Unauthorized use against systems you don't own is illegal and unethical.

# CAVEATS

Using this tool against systems without authorization is illegal in most jurisdictions. Only use for legitimate load testing, penetration testing with written permission, or security research on your own systems.

# SEE ALSO

[ab](/man/ab)(1), [siege](/man/siege)(1), [wrk](/man/wrk)(1)
