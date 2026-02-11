# TAGLINE

Send email via mail transfer agent

# TLDR

**Send an email** from command line

```echo "Message body" | sendmail [recipient@example.com]```

**Send email with subject** (using mail headers)

```printf "Subject: Test\n\nMessage body" | sendmail [recipient@example.com]```

**Send email from a file**

```sendmail [recipient@example.com] < [message.txt]```

**Process mail queue**

```sendmail -q```

**Display mail queue**

```sendmail -bp```

**Test configuration** without sending

```sendmail -bv [recipient@example.com]```

# SYNOPSIS

**sendmail** [**-flags**] [_address_...]

# PARAMETERS

**-t**
> Read recipients from message headers (To:, Cc:, Bcc:)

**-f** _address_
> Set envelope sender address

**-F** _name_
> Set full name of sender

**-i**
> Ignore dots alone on lines

**-q**
> Process saved messages in queue

**-bp**
> Print mail queue summary

**-bv**
> Verify addresses without sending

**-bd**
> Run as daemon

**-bs**
> Use SMTP protocol on stdin/stdout

**-v**
> Verbose mode

**-O** _option_=_value_
> Set mail server option

# DESCRIPTION

**sendmail** is the traditional Unix mail transfer agent (MTA) interface. While the original sendmail program is complex, most Linux systems use compatible alternatives (Postfix, Exim) that provide the same command-line interface.

The command accepts a message on standard input and delivers it to the specified recipients. Headers can be included in the input; if **-t** is used, recipients are read from the To/Cc/Bcc headers instead of command-line arguments.

For simple email sending, the message format includes optional headers followed by a blank line and the body. Headers like Subject:, From:, To: are standard.

The mail queue holds messages awaiting delivery. Use **-q** to trigger queue processing and **-bp** (or **mailq**) to view queue status.

# MESSAGE FORMAT

```
From: sender@example.com
To: recipient@example.com
Subject: Test Email

This is the message body.
```

# CONFIGURATION

**/etc/mail/sendmail.cf**
> Main sendmail configuration file (or equivalent for Postfix/Exim compatibility layer).

**/etc/aliases**
> Mail alias database mapping local addresses to recipients or programs.

**/var/spool/mqueue/**
> Mail queue directory holding messages awaiting delivery.

# CAVEATS

Modern systems often use Postfix or Exim providing sendmail-compatible interfaces. The actual MTA may be different from traditional sendmail.

Many systems require proper configuration before sendmail can deliver external mail. Without an MTA configured, mail may only work locally.

Avoid using sendmail for bulk mail or automation without proper authentication, SPF, DKIM, and DMARC configuration to prevent spam classification.

# HISTORY

Sendmail was written by **Eric Allman** at UC Berkeley, with the first version released in **1983**. It became the dominant Unix MTA and established the standard command-line interface that alternatives like Postfix and Exim maintain for compatibility.

# SEE ALSO

[mail](/man/mail)(1), [postfix](/man/postfix)(1), [mailq](/man/mailq)(1), [newaliases](/man/newaliases)(1)
