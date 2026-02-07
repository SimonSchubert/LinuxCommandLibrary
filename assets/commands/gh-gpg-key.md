# TAGLINE

manage GPG keys for commit signing

# TLDR

**List GPG keys**

```gh gpg-key list```

**Add a GPG key**

```gh gpg-key add [key.pub]```

**Delete a GPG key**

```gh gpg-key delete [key_id]```

# SYNOPSIS

**gh** **gpg-key** _command_ [_options_]

# SUBCOMMANDS

**list**
> List GPG keys.

**add**
> Add a GPG key.

**delete**
> Delete a GPG key.

# DESCRIPTION

**gh gpg-key** manages GPG keys associated with your GitHub account. GPG keys are used to sign commits and verify their authenticity.

# SEE ALSO

[gh](/man/gh)(1), [gh-ssh-key](/man/gh-ssh-key)(1)

