# TAGLINE

Push objects over HTTP/WebDAV

# TLDR

**Push a branch via HTTP/DAV to a remote**

```git http-push [url] [refs]```

**Push all refs via HTTP to a remote**

```git http-push --all [url]```

**Dry run to see what would be pushed**

```git http-push --dry-run [url] [refs]```

**Force push via HTTP** overwriting remote ref

```git http-push --force [url] [refs]```

**Push with verbose output** showing object details

```git http-push --verbose [url] [refs]```

# SYNOPSIS

**git http-push** [_options_] _url_ _refs_

# PARAMETERS

_URL_
> Remote repository URL.

_REFS_
> References to push.

**--all**
> Push all refs. Verifies all objects in the entire local ref history exist in the remote repository rather than assuming completeness.

**--force**
> Allow updating a remote ref that is not an ancestor of the local ref (disables fast-forward check).

**--dry-run**
> Do everything except actually send the updates.

**--verbose**
> Report the list of objects being walked locally and the list of objects successfully sent to the remote repository.

**-d**, **-D**
> Remove refs from the remote repository instead of pushing to them.

# DESCRIPTION

**git http-push** pushes objects and updates refs in a remote repository over HTTP/WebDAV. It is a low-level plumbing command used internally by **git push** when the remote uses the older DAV-based HTTP protocol.

This command is rarely used directly. Modern HTTP Git servers use the smart HTTP protocol which is handled by **git push** automatically. The DAV-based push requires the remote server to have WebDAV write access enabled and is considered legacy.

# CAVEATS

Legacy protocol. Modern servers use smart HTTP. Rarely needed directly. The remote HTTP server must support WebDAV with write permissions. Authentication is handled via standard HTTP credentials.

# HISTORY

git http-push was one of the early remote protocols in **Git**, using WebDAV for HTTP push before the smart HTTP protocol was developed.

# SEE ALSO

[git-push](/man/git-push)(1), [git-remote](/man/git-remote)(1), [git-fetch](/man/git-fetch)(1)
