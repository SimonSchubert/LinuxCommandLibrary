# TAGLINE

Manage SSH keys for GitHub authentication

# TLDR

**List SSH keys**

```gh ssh-key list```

**Add an SSH key**

```gh ssh-key add [key.pub]```

**Add with title**

```gh ssh-key add [key.pub] -t "[title]"```

**Delete an SSH key**

```gh ssh-key delete [key_id]```

# SYNOPSIS

**gh** **ssh-key** _command_ [_options_]

# SUBCOMMANDS

**list**
> List SSH keys.

**add**
> Add an SSH key.

**delete**
> Delete an SSH key.

# PARAMETERS

**-t**, **--title** _title_
> Key title.

# DESCRIPTION

**gh ssh-key** manages SSH public keys associated with your GitHub account for secure Git authentication. SSH keys provide an alternative to HTTPS authentication, enabling passwordless git operations.

The command supports adding new SSH keys from public key files, typically generated with **ssh-keygen**. Keys can be labeled with titles for identification when managing multiple keys across different machines. Deletion removes keys from your GitHub account, immediately revoking access.

# SEE ALSO

[gh](/man/gh)(1), [gh-gpg-key](/man/gh-gpg-key)(1)
