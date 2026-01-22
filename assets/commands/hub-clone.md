# TLDR

**Clone with shorthand**

```hub clone [user/repo]```

**Clone to directory**

```hub clone [user/repo] [directory]```

**Clone with depth**

```hub clone --depth [1] [user/repo]```

**Clone own repository**

```hub clone [repo-name]```

# SYNOPSIS

**hub clone** [_options_] _repository_ [_directory_]

# PARAMETERS

_REPOSITORY_
> GitHub repository (user/repo or just repo).

_DIRECTORY_
> Target directory.

**--depth** _N_
> Shallow clone depth.

**-b** _BRANCH_
> Checkout branch.

**--help**
> Display help information.

# DESCRIPTION

**hub clone** clones GitHub repositories using shorthand notation. It expands user/repo format to full GitHub URLs automatically.

The command supports cloning your own repositories with just the repo name. It wraps git clone with GitHub-specific conveniences.

hub clone clones GitHub repos with shorthand.

# CAVEATS

Part of hub tool. Superseded by gh repo clone. Requires GitHub authentication.

# HISTORY

hub clone is part of **hub**, GitHub's original CLI tool before the official **gh** CLI.

# SEE ALSO

[hub](/man/hub)(1), [git-clone](/man/git-clone)(1), [gh](/man/gh)(1)
