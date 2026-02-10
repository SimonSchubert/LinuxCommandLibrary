# TAGLINE

fast, cross-platform network scanner that scans IP addresses and ports

# TLDR

**Launch Angry IP Scanner** GUI

```ipscan```

**Scan a single IP address** from command line

```ipscan -s -f:txt -o [output.txt] [192.168.1.1]```

**Scan an IP range** and save results

```ipscan -s -f:txt -o [output.txt] [192.168.1.1] [192.168.1.254]```

**Scan using a file** with IP addresses

```ipscan -s -f:csv -o [output.csv] -ff:[iplist.txt]```

**Scan and export in XML format**

```ipscan -s -f:xml -o [output.xml] [192.168.1.0/24]```

# SYNOPSIS

**ipscan** [_-s_] [_-f:format_] [_-o filename_] [_-ff:filename_] [_start-ip_] [_end-ip_]

# PARAMETERS

**-s**
> Run in silent (command-line) mode without GUI

**-f:format**
> Output format: txt, csv, xml, ip-port

**-o** _filename_
> Output filename for scan results

**-ff:** _filename_
> Read IP addresses from file

**-q**
> Quit after scanning (with -s)

**-a**
> Append to output file instead of overwriting

# DESCRIPTION

**ipscan** (Angry IP Scanner) is a fast, cross-platform network scanner that scans IP addresses and ports. It uses multiple threads for speed and can detect live hosts, resolve hostnames, scan ports, and retrieve NetBIOS information.

The tool can run as a GUI application for interactive use or in command-line mode for scripting and automation. It supports multiple output formats for integration with other tools.

# CAVEATS

High scan rates may trigger IDS/IPS alerts or violate network policies. Some features require administrative privileges. Port scanning without authorization may be illegal in certain jurisdictions. The GUI requires Java to be installed.

# HISTORY

**Angry IP Scanner** was created by Anton Keks and first released in **2001**. Originally written for Windows, it was rewritten in Java around **2007** to become cross-platform. It remains one of the most popular open-source network scanners with millions of downloads.

# SEE ALSO

[nmap](/man/nmap)(1), [masscan](/man/masscan)(1), [ping](/man/ping)(1), [netcat](/man/netcat)(1)
