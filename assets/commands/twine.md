# TAGLINE

Upload Python packages to PyPI

# TLDR

**Upload package to PyPI**

```twine upload dist/*```

**Upload to TestPyPI**

```twine upload --repository testpypi dist/*```

**Upload with credentials**

```twine upload -u [username] -p [password] dist/*```

**Check package before upload**

```twine check dist/*```

**Upload specific files**

```twine upload [dist/package-1.0.tar.gz]```

**Upload with verbose output**

```twine upload --verbose dist/*```

# SYNOPSIS

**twine** [_upload_] [_check_] [_-r repository_] [_-u user_] [_options_] _files_

# PARAMETERS

**upload** _FILES_
> Upload packages.

**check** _FILES_
> Check package metadata.

**-r** _REPO_, **--repository** _REPO_
> Target repository (pypi, testpypi, or URL).

**--repository-url** _URL_
> Repository URL.

**-u** _USER_, **--username** _USER_
> Username.

**-p** _PASS_, **--password** _PASS_
> Password.

**--non-interactive**
> Don't prompt for credentials.

**-s**, **--sign**
> Sign files with GPG.

**-c** _FILE_, **--config-file** _FILE_
> Config file.

**--skip-existing**
> Skip already-uploaded files.

**--verbose**
> Verbose output.

# DESCRIPTION

**twine** uploads Python packages to PyPI and other package indexes. It's the recommended tool for publishing Python packages.

Package files (.tar.gz and .whl) in the dist directory are uploaded. These are created by build tools like build or setuptools.

Check mode validates package metadata before upload. It catches common issues that would cause upload failure.

TestPyPI allows testing the upload process without affecting the real PyPI. Packages can be installed from TestPyPI to verify.

Authentication uses username/password, API tokens, or keyring integration. API tokens are recommended for security.

HTTPS is always used for uploads. Previous tools allowed insecure uploads, which twine explicitly prevents.

# CONFIGURATION

**~/.pypirc**
> Repository credentials and URLs for PyPI, TestPyPI, and custom indexes.

**TWINE_USERNAME**
> Environment variable for authentication username.

**TWINE_PASSWORD**
> Environment variable for authentication password or API token.

# CAVEATS

Package names are permanent on PyPI. Version numbers can't be reused. Credentials need secure handling. Package must pass validation.

# HISTORY

**Twine** was created by the Python Packaging Authority around **2013** to replace the insecure upload mechanism in setuptools. It ensures all uploads use HTTPS.

# SEE ALSO

[pip](/man/pip)(1), [build](/man/build)(1), [setuptools](/man/setuptools)(1), [flit](/man/flit)(1)
