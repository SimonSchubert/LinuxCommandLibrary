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

**-help**
> Show help.

# DESCRIPTION

**spfquery** validates SPF records. It checks email authorization.

Sender Policy Framework. Email authentication.

Checks IP authorization. Against domain policy.

Returns SPF result. Pass, fail, neutral, etc.

Mail server debugging. Test configurations.

# CAVEATS

DNS required. SPF record must exist. Result interpretation needed.

# HISTORY

**spfquery** is part of **libspf2**, providing SPF (Sender Policy Framework) validation for email authentication.

# SEE ALSO

[dig](/man/dig)(1), [host](/man/host)(1), [postfix](/man/postfix)(1)
