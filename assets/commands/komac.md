# TLDR

**Create new package manifest**

```komac new```

**Update existing package**

```komac update [package-id]```

**Update with specific version**

```komac update [package-id] --version [1.0.0] --urls [url1] [url2]```

**Remove package version**

```komac remove [package-id] --version [1.0.0]```

**Sync fork with upstream**

```komac sync-fork```

# SYNOPSIS

**komac** [_options_] _command_ [_args_...]

# PARAMETERS

**new**
> Create package from scratch.

**update** _package-id_
> Update existing package manifest.

**remove** _package-id_
> Remove version from winget-pkgs.

**sync-fork**
> Sync fork with microsoft/winget-pkgs.

**--version** _version_
> Package version.

**--urls** _urls_
> Installer URLs.

**--submit**
> Submit PR automatically.

# DESCRIPTION

**komac** is the Community Manifest Creator for WinGet. It automates creating and submitting package manifests to the winget-pkgs repository. Features advanced installer analysis for Inno Setup, NSIS, MSI, and Burn installers.

# CAVEATS

Requires a classic GitHub token with public_repo scope to submit pull requests. Fine-grained tokens may not work for PR creation.

# SEE ALSO

[winget](/man/winget)(1)

