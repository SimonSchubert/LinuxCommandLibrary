# TAGLINE

Manage the uv installation itself

# TLDR

**Update uv to the latest version**

```uv self update```

**Update uv to a specific version**

```uv self update [0.6.0]```

**Check for an update** without installing it

```uv self update --dry-run```

**Use a GitHub token** to avoid rate limits

```uv self update --token [token]```

**Display the version** of uv

```uv self version```

# SYNOPSIS

**uv** **self** _command_ [_options_]

# PARAMETERS

**update** [_target-version_]
> Update uv to the latest version, or to the specified version.

**version**
> Display uv's version.

**--dry-run**
> Run **update** without performing the update.

**--token** _token_
> GitHub token used by **update** to reduce the chance of rate limiting. Also read from **UV_GITHUB_TOKEN**.

# DESCRIPTION

**uv self** manages the uv installation itself. Use it to update uv to the latest or a specific version, or to display the version. Updating re-runs the installer and can modify shell profiles; set **UV_NO_MODIFY_PATH=1** to prevent that.

# CAVEATS

Self-update only works when uv was installed with the standalone installer. With any other installation method, use that package manager's upgrade command. There is no **uv self uninstall**: to remove uv, delete the uv and uvx binaries, after optionally running **uv cache clean** and removing the directories shown by **uv python dir** and **uv tool dir**.

# SEE ALSO

[uv](/man/uv)(1), [uv-version](/man/uv-version)(1), [uv-pip](/man/uv-pip)(1), [uv-tool](/man/uv-tool)(1), [pip](/man/pip)(1)

# RESOURCES

```[Source code](https://github.com/astral-sh/uv)```

```[Documentation](https://docs.astral.sh/uv/)```

<!-- verified: 2026-11-09 -->
