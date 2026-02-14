# TAGLINE

Convert Kerberos tickets between ccache and kirbi formats

# TLDR

**Convert a kirbi ticket to ccache** format

```impacket-ticketConverter [ticket.kirbi] [ticket.ccache]```

**Convert a ccache ticket to kirbi** format

```impacket-ticketConverter [ticket.ccache] [ticket.kirbi]```

**Convert a base64-encoded ticket**

```impacket-ticketConverter -b [encoded_ticket.txt] [ticket.ccache]```

# SYNOPSIS

**impacket-ticketConverter** [**-h**] [**-b**] _input_file_ _output_file_

# PARAMETERS

_input_file_
> Source ticket file in either kirbi (KRB-CRED) or ccache format. The format is detected automatically.

_output_file_
> Destination filename for the converted ticket.

**-b, --base64**
> Decode the input ticket from base64 encoding before conversion.

**-h, --help**
> Show help message and exit.

# DESCRIPTION

**impacket-ticketConverter** converts Kerberos authentication tickets between two common formats: **ccache** (used by UNIX-based tools like Impacket) and **kirbi** / KRB-CRED (used by Windows tools like Mimikatz). The tool automatically detects the input format by examining the first byte of the file and converts to the opposite format.

This is useful when working across platforms during authorized security assessments, where tickets obtained on Windows need to be used with Linux-based tools or vice versa.

# CAVEATS

Part of the **Impacket** toolkit. The tool only converts between ccache and kirbi formats; it does not create, modify, or validate tickets. Requires Python and the Impacket library to be installed. Only for use in authorized security testing contexts.

# HISTORY

**Impacket** was originally developed by **SecureAuth** and is now maintained by **Fortra's Core Security**. It is a collection of Python classes for working with network protocols, designed to assist security professionals with penetration testing and security research.

# SEE ALSO

[impacket](/man/impacket)(1), [kinit](/man/kinit)(1), [klist](/man/klist)(1)
