# TLDR

**List available smartcards**

```gpg-card list```

**Display card information**

```gpg-card info```

**Change PIN**

```gpg-card passwd```

**Set cardholder name**

```gpg-card name```

**Fetch public key from card URL**

```gpg-card fetch```

**Generate keys on card**

```gpg-card generate```

**Reset card to factory defaults**

```gpg-card factory-reset```

# SYNOPSIS

**gpg-card** [_options_] [_command_ [_args_]]

# SUBCOMMANDS

**list**
> List available cards and readers.

**info**
> Display card information.

**name**
> Set cardholder name.

**lang**
> Set language preference.

**url**
> Set public key URL.

**fetch**
> Fetch key from URL on card.

**passwd**
> Change PIN, Admin PIN, or Reset Code.

**generate**
> Generate keys on card.

**keytocard**
> Transfer key to card.

**forcesig**
> Toggle signature PIN requirement.

**factory-reset**
> Reset card to factory defaults.

# DESCRIPTION

**gpg-card** is a GnuPG tool for managing OpenPGP and PIV smartcards. It provides an interactive interface for configuring cards, managing PINs, generating keys, and transferring keys to smartcards. Introduced in GnuPG 2.3 as a replacement for the older **gpg --card-edit** workflow.

# SEE ALSO

[gpg](/man/gpg)(1), [gpg-agent](/man/gpg-agent)(1)

