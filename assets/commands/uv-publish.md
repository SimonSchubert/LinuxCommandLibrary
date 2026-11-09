# TAGLINE

Publish Python packages to PyPI

# TLDR

**Publish** all distributions in dist/ to PyPI

```uv publish```

**Publish to TestPyPI**

```uv publish --publish-url https://test.pypi.org/legacy/```

**Publish** using a named index from pyproject.toml

```uv publish --index [name]```

**Publish** with an API token

```uv publish --token [pypi-token]```

**Publish specific files**

```uv publish [dist/package-1.0.tar.gz] [dist/package-1.0-py3-none-any.whl]```

**Publish** and skip already-uploaded files

```uv publish --check-url https://pypi.org/simple/```

**Validate** without uploading anything

```uv publish --dry-run```

# SYNOPSIS

**uv** **publish** [_options_] [_files_...]

# PARAMETERS

**--publish-url** _url_
> URL of the upload endpoint (not the index URL). Defaults to `https://upload.pypi.org/legacy/`. Env: UV_PUBLISH_URL.

**--index** _name_
> Publish to a named index from the configuration, which must have a **publish-url**. Its URL is also used to skip existing files. Env: UV_PUBLISH_INDEX.

**--token**, **-t** _token_
> Authentication token (e.g., PyPI API token). Env: UV_PUBLISH_TOKEN.

**--username**, **-u** _user_
> Repository username. Env: UV_PUBLISH_USERNAME.

**--password**, **-p** _pass_
> Repository password. Env: UV_PUBLISH_PASSWORD.

**--check-url** _url_
> Index URL to check for existing packages; skips identical uploads and handles parallel races. Env: UV_PUBLISH_CHECK_URL.

**--trusted-publishing** _value_
> Configure trusted publishing (automatic, always, never). Supported in GitHub Actions and GitLab CI/CD.

**--keyring-provider** _provider_
> Use keyring for authentication (disabled by default, or subprocess to call the keyring CLI). Env: UV_KEYRING_PROVIDER.

**--dry-run**
> Check distribution metadata locally, and existing files if **--check-url** or **--index** is given, without uploading.

**--allow-insecure-host** _host_
> Skip certificate verification for a host. Env: UV_INSECURE_HOST.

**--no-attestations**
> Do not upload matching PEP 740 attestations. Env: UV_PUBLISH_NO_ATTESTATIONS.

# DESCRIPTION

**uv publish** uploads Python packages to PyPI or other registries. It publishes wheel and source distributions found in the dist/ directory by default. Supports authentication via API token, username/password, trusted publishing (GitHub Actions, GitLab CI/CD), or keyring.

When **--check-url** is provided, uv skips uploading files that are identical to those already on the registry, making it safe for parallel CI uploads.

# SEE ALSO

[uv](/man/uv)(1), [uv-build](/man/uv-build)(1), [twine](/man/twine)(1), [pip](/man/pip)(1)

# RESOURCES

```[Source code](https://github.com/astral-sh/uv)```

```[Documentation](https://docs.astral.sh/uv/)```

<!-- verified: 2026-11-09 -->
