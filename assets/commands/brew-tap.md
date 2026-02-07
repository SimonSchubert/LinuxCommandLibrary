# TAGLINE

Add third-party repositories to Homebrew

# TLDR

**List all tapped repositories**

```brew tap```

**Tap a repository from GitHub**

```brew tap [user]/[repo]```

**Tap repository from custom URL**

```brew tap [user]/[repo] [https://example.com/repo.git]```

**Untap a repository**

```brew untap [user]/[repo]```

**Create a new tap with template**

```brew tap-new [user]/[repo]```

# SYNOPSIS

**brew tap** [_user/repo_] [_url_]

# DESCRIPTION

**brew tap** adds third-party repositories to Homebrew, extending the available formulae and casks beyond the core repository. Tapped repositories are automatically updated when running **brew update**.

By default, tap assumes GitHub repositories, but any Git URL can be specified.

# USAGE

**brew tap**
> List all currently tapped repositories

**brew tap user/repo**
> Clone https://github.com/user/homebrew-repo

**brew tap user/repo URL**
> Clone repository from custom URL

# REPOSITORY NAMING

GitHub repositories must be named **homebrew-something** to use the short form. The prefix is automatically added when needed:

- **brew tap user/foobar** clones **user/homebrew-foobar**

# INSTALLING FROM TAPS

After tapping, formulae are available directly:

```brew install formula```

For explicit tap reference:

```brew install user/repo/formula```

# PARAMETERS

**--full**
> Clone repository as full Git repo (enables git operations)

**--force-auto-update**
> Auto-update even if not from GitHub

**--shallow**
> Clone with shallow depth

# CAVEATS

Tapped formulae are updated automatically with **brew update**. When core and tap have same formula name, core takes precedence unless fully qualified. Private repositories require authentication.

# SEE ALSO

[brew](/man/brew)(1), [brew-update](/man/brew-update)(1), [brew-install](/man/brew-install)(1)
