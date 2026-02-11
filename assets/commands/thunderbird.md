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

# SYNOPSIS

**thunderbird** [_-compose opts_] [_-P profile_] [_options_]

# PARAMETERS

**-compose** _OPTS_
> Compose message.

**-P** _NAME_
> Use profile.

**-ProfileManager**
> Profile manager.

**-safe-mode**
> Safe mode.

**-mail**
> Check mail.

**-addressbook**
> Open address book.

# DESCRIPTION

**thunderbird** is Mozilla's free, open-source email client that supports multiple email accounts, calendar integration, an address book, RSS feed reading, and built-in OpenPGP encryption for secure messaging.

The application supports IMAP, POP3, and SMTP protocols, and can be extended with add-ons for additional functionality. It uses profiles to store settings and data, manageable through the **-ProfileManager** flag, and can be launched in **-safe-mode** to troubleshoot issues with extensions.

# CAVEATS

Desktop application. Profile-based storage. Memory usage can be high.

# HISTORY

**Thunderbird** is developed by **Mozilla Foundation** as a free, open-source email client companion to Firefox.

# SEE ALSO

[mutt](/man/mutt)(1), [evolution](/man/evolution)(1), [firefox](/man/firefox)(1)
