# TAGLINE

Validate SPF email authentication records

# TLDR

**Check SPF record**

```spfquery -ip [192.168.1.1] -sender [user@example.com]```

**Query domain**

```spfquery -ip [ip] -sender [email] -helo [mail.example.com]```

**Debug mode**

```spfquery -debug -ip [ip] -sender [email]```

**Show version**

```spfquery -version```

# SYNOPSIS

**spfquery** [_-ip addr_] [_-sender email_] [_-helo hostname_] [_options_]

# PARAMETERS

**-ip** _ADDR_
> Client IP address.

**-sender** _EMAIL_
> Envelope sender.

**-helo** _HOST_
> HELO hostname.

**-debug**
> Debug output.

**-version**
> Show version.

**-rcpt-to** _EMAIL_
> Envelope recipient address (for secondary MX checking).

**-help**
> Show help.

# DESCRIPTION

**spfquery** validates Sender Policy Framework (SPF) records by checking whether a given IP address is authorized to send email on behalf of a domain. It queries the domain's DNS SPF record and evaluates the sending IP against the published policy.

The tool returns standard SPF result codes: pass, fail, softfail, neutral, none, temperror, or permerror. It is useful for mail server administrators to debug SPF configurations, verify that DNS records are correct, and troubleshoot email delivery issues caused by SPF failures.

As part of the **libspf2** library, spfquery implements the full SPF specification including mechanism evaluation, macro expansion, and redirect/include processing.

# CAVEATS

Requires DNS connectivity to resolve SPF records. SPF records must exist for the queried domain. Result codes require proper interpretation for policy enforcement.

# SEE ALSO

[dig](/man/dig)(1), [host](/man/host)(1), [nslookup](/man/nslookup)(1), [sendmail](/man/sendmail)(1), [postfix](/man/postfix)(1)
