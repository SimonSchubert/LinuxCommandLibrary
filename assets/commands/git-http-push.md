# TLDR

**Push via HTTP**

```git http-push [url] [refs]```

# SYNOPSIS

**git http-push** [_options_] _url_ _refs_

# PARAMETERS

_URL_
> Remote repository URL.

_REFS_
> References to push.

**--all**
> Push all refs.

**--force**
> Force push.

**--dry-run**
> Show what would be pushed.

**--verbose**
> Verbose output.

**--help**
> Display help information.

# DESCRIPTION

**git http-push** pushes objects to a remote repository over HTTP/WebDAV. It's a low-level command used by git push when the remote uses the older DAV-based HTTP protocol.

This command is rarely used directly. Modern HTTP git servers use the smart HTTP protocol which is handled by git push directly. DAV push is considered legacy.

git http-push provides DAV-based HTTP push for legacy servers.

# CAVEATS

Legacy protocol. Modern servers use smart HTTP. Rarely needed directly.

# HISTORY

git http-push was one of the early remote protocols in **Git**, using WebDAV for HTTP push before the smart HTTP protocol was developed.

# SEE ALSO

[git-push](/man/git-push)(1), [git-send-pack](/man/git-send-pack)(1)
