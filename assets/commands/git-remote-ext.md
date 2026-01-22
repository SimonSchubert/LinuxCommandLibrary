# TLDR

**Clone via external command**

```git clone "ext::[command] [args]"```

**Use with custom transport**

```git remote add myremote "ext::[transport-cmd] %S [host]"```

# SYNOPSIS

**git-remote-ext** _url_

# PARAMETERS

_URL_
> ext:: URL with command template.

**%s**
> Replaced with service name.

**%S**
> Replaced with long service name.

**%G**
> Replaced with service (git only).

**%V**
> Replaced with version.

**--help**
> Display help information.

# DESCRIPTION

**git-remote-ext** is a remote helper that allows arbitrary external commands to handle git transport. The ext:: URL scheme specifies a command to run for communication.

The helper enables custom transport mechanisms, like using specific SSH commands or non-standard protocols. Template variables allow dynamic command construction.

git-remote-ext provides flexible transport for special cases.

# CAVEATS

Security sensitive: commands run from URLs. Internal helper, not typically used directly. Used through ext:: URLs.

# HISTORY

git-remote-ext is a **Git** remote helper enabling custom transport mechanisms through arbitrary command execution.

# SEE ALSO

[git-remote](/man/git-remote)(1), [git-remote-fd](/man/git-remote-fd)(1)
