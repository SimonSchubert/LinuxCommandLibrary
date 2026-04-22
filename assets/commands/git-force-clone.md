# TAGLINE

force-clone a repository, replacing the target directory if it exists

# TLDR

**Force clone** into a directory, removing any existing contents first

```git force-clone [url] [directory]```

**Force clone at a specific branch**

```git force-clone -b [branch] [url] [directory]```

**Force clone and reset to the remote head** even if the dir is a checkout

```git force-clone [https://github.com/owner/repo.git] [existing-dir]```

# SYNOPSIS

**git force-clone** [**-b** _BRANCH_] _URL_ _DIRECTORY_

# PARAMETERS

_URL_
> Repository URL (https, ssh, git, or local path).

_DIRECTORY_
> Target directory. If it already exists and contains a clone of the same repo, its contents are reset to match the remote. If it exists but is a different repo (or random files), it is removed and re-cloned.

**-b** _BRANCH_
> Check out _BRANCH_ after cloning.

**--help**
> Show help.

# DESCRIPTION

**git force-clone** from the **git-extras** suite guarantees the target directory ends up as a fresh, clean clone of the given URL. It is the "just give me what's on the remote" hammer for deployment scripts:

- If the directory does not exist, it clones normally.
- If the directory is already a clone of the same URL, it fetches and hard-resets the working tree to match the remote, discarding any local changes.
- If the directory exists but is a different repository (or contains unrelated files), it removes the directory and re-clones.

# CAVEATS

**Destructive.** Uncommitted changes in the target directory are lost without confirmation. Local branches not pushed to the remote will be removed if the directory is re-cloned. Use with care, especially in interactive contexts — prefer `git fetch` + `git reset --hard` when you only need to resync and want to keep other local state.

# HISTORY

**git force-clone** is part of **git-extras**, the long-running collection of git helpers by **TJ Holowaychuk** and contributors.

# SEE ALSO

[git-clone](/man/git-clone)(1), [git-reset](/man/git-reset)(1), [git-fetch](/man/git-fetch)(1), [git-extras](/man/git-extras)(1)
