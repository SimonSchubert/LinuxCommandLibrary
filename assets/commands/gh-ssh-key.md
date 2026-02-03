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

**gh ssh-key** manages SSH keys associated with your GitHub account. SSH keys enable secure authentication for Git operations.

# SEE ALSO

[gh](/man/gh)(1), [gh-gpg-key](/man/gh-gpg-key)(1)

