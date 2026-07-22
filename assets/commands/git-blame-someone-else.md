# TAGLINE

rewrite the author and committer of a commit

# TLDR

**Reassign** a commit to another author

```git blame-someone-else "[Author Name] <email@example.com>" [commit]```

**Reassign** the most recent commit

```git blame-someone-else "[Name] <email@example.com>" HEAD```

**Reassign** a commit by hash

```git blame-someone-else "[Name] <email@example.com>" [abc123]```

# SYNOPSIS

**git blame-someone-else** _author_ _commit_

# PARAMETERS

_author_
> New identity, in **"Name &lt;email&gt;"** format.

_commit_
> The commit to rewrite.

# DESCRIPTION

**git blame-someone-else** rewrites a commit so that it appears to have been made by someone else. It is a standalone script by **Jay Phelps**, written as a joke, and is not part of git-extras or core git.

Mechanically it uses **git filter-branch** with **GIT_AUTHOR_NAME**, **GIT_AUTHOR_EMAIL**, **GIT_COMMITTER_NAME** and **GIT_COMMITTER_EMAIL** overridden for the target commit, then rewrites every commit from that point forward. Both the author and the committer are changed, not just the author.

The one defensible use is repairing your own attribution: commits made with a misconfigured **user.email**, or from a shared machine, where the recorded identity is simply wrong.

# CAVEATS

This is a joke tool, and its author says so explicitly, along with a request not to run it against a production repository and complain if it eats everything. Treat it accordingly.

It **rewrites history**. Every commit from the target onwards gets a new hash, so anyone who has already pulled the old commits will have a diverging history, and publishing the result needs a force push. Never run it on a shared branch.

It changes the **committer** as well as the author, so it does not merely correct attribution, it erases the record of who actually made the commit.

Attributing work to a real person who did not write it is dishonest, and on a repository you do not own it may violate the project's contribution terms. Signed commits do not survive: the rewrite invalidates any GPG signature, which is one of the few technical defences against exactly this.

Correcting your own identity does not need this tool. **git commit --amend --author="Name <email>"** fixes the most recent commit, and **git rebase -i** with **--reset-author** handles older ones with less collateral damage.

# HISTORY

**git blame-someone-else** was written by **Jay Phelps** in **2016** as a joke. Its README quotes an endorsement from **Linus Torvalds**, which is itself a fabricated commit produced by the tool to demonstrate that it works.

# INSTALL

```apt: sudo apt install git```

```dnf: sudo dnf install git```

```pacman: sudo pacman -S git```

```apk: sudo apk add git```

```zypper: sudo zypper install git```

```brew: brew install git```

```nix: nix profile install nixpkgs#git```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[git-blame](/man/git-blame)(1), [git-commit](/man/git-commit)(1), [git-filter-branch](/man/git-filter-branch)(1), [git-rebase](/man/git-rebase)(1)

# RESOURCES

```[Source code](https://github.com/jayphelps/git-blame-someone-else)```

<!-- verified: 2026-07-16 -->
