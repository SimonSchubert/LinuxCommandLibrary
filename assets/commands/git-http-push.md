# TAGLINE

Push objects over HTTP/WebDAV

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

**git http-push** pushes objects to a remote repository over HTTP/WebDAV. It is a low-level command used by git push when the remote uses the older DAV-based HTTP protocol.

This command is rarely used directly. Modern HTTP Git servers use the smart HTTP protocol which is handled by git push automatically. The DAV-based push is considered legacy and retained for backward compatibility.

# CAVEATS

Legacy protocol. Modern servers use smart HTTP. Rarely needed directly.

# HISTORY

git http-push was one of the early remote protocols in **Git**, using WebDAV for HTTP push before the smart HTTP protocol was developed.

# SEE ALSO

[git-push](/man/git-push)(1), [git-send-pack](/man/git-send-pack)(1)
