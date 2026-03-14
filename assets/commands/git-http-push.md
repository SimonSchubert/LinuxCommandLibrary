# TAGLINE

Push objects over HTTP/WebDAV

# TLDR

**Push all refs via HTTP to a remote**

```git http-push --all [url]```

**Dry run to see what would be pushed**

```git http-push --dry-run [url] [refs]```

**Force push via HTTP**

```git http-push --force [url] [refs]```

# SYNOPSIS

**git http-push** [_options_] _url_ _refs_

# PARAMETERS

_URL_
> Remote repository URL.

_REFS_
> References to push.

**--all**
> Do not assume the remote repository is complete; verify all objects in the entire local ref's history exist in the remote repository.

**--force**
> Allow updating a remote ref that is not an ancestor of the local ref used to overwrite it (disables fast-forward check).

**--dry-run**
> Do everything except actually send the updates.

**--verbose**
> Report the list of objects being walked locally and the list of objects successfully sent to the remote repository.

# DESCRIPTION

**git http-push** pushes objects and updates refs in a remote repository over HTTP/DAV. It is a low-level plumbing command used by git push when the remote uses the older DAV-based HTTP protocol.

This command is rarely used directly. Modern HTTP Git servers use the smart HTTP protocol which is handled by git push automatically. The DAV-based push is considered legacy and retained for backward compatibility.

# CAVEATS

Legacy protocol. Modern servers use smart HTTP. Rarely needed directly.

# HISTORY

git http-push was one of the early remote protocols in **Git**, using WebDAV for HTTP push before the smart HTTP protocol was developed.

# SEE ALSO

[git-push](/man/git-push)(1)
