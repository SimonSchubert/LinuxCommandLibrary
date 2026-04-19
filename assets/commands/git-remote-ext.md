# TAGLINE

External command transport helper

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
> Replaced with service name (e.g. `upload-pack`, `receive-pack`, `upload-archive`) without the `git-` prefix.

**%S**
> Replaced with long service name (e.g. `git-upload-pack`) including the `git-` prefix.

**%G**
> Placed as the first argument; suppresses the service-name argument so the remote command can accept extra positional arguments.

**%V**
> Only valid as the second argument; injects the Git protocol version (e.g. `version=2`) as an environment setting.

**%%**
> Literal percent sign.

**--help**
> Display help information.

# DESCRIPTION

**git-remote-ext** is a remote helper that allows arbitrary external commands to handle Git transport. The `ext::` URL scheme specifies a command to run for communication, enabling custom transport mechanisms like specific SSH commands or non-standard protocols.

Template variables (such as `%s`, `%S`, `%G`) allow dynamic command construction based on the Git service being requested. This helper is typically not invoked directly but is used through `ext::` URLs in remote configurations.

# CAVEATS

Security sensitive: commands run from URLs. Internal helper, not typically used directly. Used through ext:: URLs.

# HISTORY

git-remote-ext is a **Git** remote helper enabling custom transport mechanisms through arbitrary command execution.

# SEE ALSO

[git-remote](/man/git-remote)(1), [git-remote-fd](/man/git-remote-fd)(1)
