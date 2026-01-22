# TLDR

**Force clone to directory**

```git force-clone [url] [directory]```

**Force clone to existing directory**

```git force-clone [https://github.com/owner/repo.git] [existing-dir]```

# SYNOPSIS

**git force-clone** _url_ _directory_

# PARAMETERS

_URL_
> Repository URL to clone.

_DIRECTORY_
> Target directory (will be overwritten).

**--help**
> Display help information.

# DESCRIPTION

**git force-clone** clones a repository, forcibly removing any existing directory at the target path. It combines rm -rf with git clone, useful for ensuring a fresh clone.

The command is dangerous as it unconditionally deletes the target directory. It's useful for deployment scripts where you always want a clean clone state.

git force-clone provides destructive but predictable clone behavior.

# CAVEATS

**Deletes target directory without confirmation.** Part of git-extras. Use with extreme caution.

# HISTORY

git force-clone is part of **git-extras**, providing a convenience command for scripts requiring guaranteed fresh clones.

# SEE ALSO

[git-clone](/man/git-clone)(1), [git-fresh-branch](/man/git-fresh-branch)(1)
