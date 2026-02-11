# TAGLINE

Publish Python packages to PyPI

# TLDR

**Publish to PyPI**

```uv publish```

**Publish to test PyPI**

```uv publish --repository testpypi```

**Publish specific files**

```uv publish dist/*```

# SYNOPSIS

**uv** **publish** [_options_] [_files_...]

# PARAMETERS

**--repository** _name_
> Target repository.

**--repository-url** _url_
> Custom repository URL.

**--token** _token_
> Authentication token.

**--username** _user_
> Repository username.

**--password** _pass_
> Repository password.

# DESCRIPTION

**uv publish** uploads Python packages to PyPI or other repositories. Publishes wheel and source distributions. Supports authentication via token or username/password.

# SEE ALSO

[uv](/man/uv)(1), [uv-build](/man/uv-build)(1), [twine](/man/twine)(1)

