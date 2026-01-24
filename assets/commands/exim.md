# TLDR

**Start mail queue processing**

```exim -q```

**Send test message**

```echo "Test" | exim [user@example.com]```

**Show mail queue**

```exim -bp```

**Display queue count**

```exim -bpc```

**Force delivery of message**

```exim -M [message_id]```

**Remove message from queue**

```exim -Mrm [message_id]```

**Test address routing**

```exim -bt [user@example.com]```

**Check configuration**

```exim -bV```

# SYNOPSIS

**exim** [_options_] [_addresses_...]

# DESCRIPTION

**exim** is a Mail Transfer Agent (MTA) that handles sending, receiving, and routing email on Unix systems. It's known for flexibility in configuration and filtering capabilities.

The tool supports ACLs, content scanning, TLS encryption, and various authentication mechanisms. It can function as both an incoming and outgoing mail server.

# PARAMETERS

**-q** [_time_]
> Run queue, optionally repeatedly.

**-bp**
> List messages in queue.

**-bpc**
> Count messages in queue.

**-bt** _address_
> Test address routing.

**-bV**
> Display version and config.

**-M** _id_
> Force delivery of message.

**-Mrm** _id_
> Remove message from queue.

**-Mvh** _id_
> View message headers.

**-Mvb** _id_
> View message body.

**-d**
> Enable debug mode.

**-C** _file_
> Use alternate configuration.

# CAVEATS

Complex configuration syntax. Requires careful security setup. Port 25 often blocked by ISPs. Log monitoring essential for production.

# HISTORY

**Exim** was originally written by **Philip Hazel** at the **University of Cambridge** starting in **1995**. The name stands for "EXperimental Internet Mailer." It became the default MTA for Debian and is widely used on Unix servers.

# SEE ALSO

[sendmail](/man/sendmail)(1), [postfix](/man/postfix)(1), [mailq](/man/mailq)(1), [mutt](/man/mutt)(1)
