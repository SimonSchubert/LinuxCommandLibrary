# TAGLINE

Mozilla email and calendar client

# TLDR

**Start Thunderbird**

```thunderbird```

**Compose new message**

```thunderbird -compose "[to='email@example.com',subject='Hello']"```

**Open profile manager**

```thunderbird -ProfileManager```

**Use specific profile**

```thunderbird -P [profile-name]```

**Safe mode**

```thunderbird -safe-mode```

**Check for new mail**

```thunderbird -mail```

**Open address book**

```thunderbird -addressbook```

# SYNOPSIS

**thunderbird** [_-compose opts_] [_-P profile_] [_options_]

# PARAMETERS

**-compose** _OPTS_
> Compose a new message. Options include to, cc, bcc, subject, body, attachment as comma-separated key=value pairs.

**-P** _NAME_
> Start with the specified profile.

**-ProfileManager**
> Open the profile manager to create or select profiles.

**-safe-mode**
> Start in safe mode with all extensions disabled for troubleshooting.

**-mail**
> Open the mail client and check for new messages.

**-addressbook**
> Open the address book.

**-no-remote**
> Do not accept or send remote commands; run a new instance.

**-search**
> Open the global search tab.

# DESCRIPTION

**thunderbird** is Mozilla's free, open-source email client that supports multiple email accounts, calendar integration, an address book, RSS feed reading, and built-in OpenPGP encryption for secure messaging.

The application supports IMAP, POP3, and SMTP protocols, and can be extended with add-ons for additional functionality. It uses profiles to store settings and data, manageable through the **-ProfileManager** flag, and can be launched in **-safe-mode** to troubleshoot issues with extensions.

# CAVEATS

Desktop application. Profile-based storage. Memory usage can be high with many accounts or large mailboxes.

# HISTORY

**Thunderbird** was originally developed by **Mozilla Foundation** as a companion to Firefox. Since 2020, it has been maintained by the **MZLA Technologies** subsidiary. It was rebranded as **Thunderbird Supernova** with the major UI refresh in version 115 (2023).

# SEE ALSO

[mutt](/man/mutt)(1), [evolution](/man/evolution)(1), [firefox](/man/firefox)(1), [neomutt](/man/neomutt)(1)
