# TAGLINE

Travis CI command-line interface

# TLDR

**Login to Travis CI**

```travis login```

**Enable repository**

```travis enable```

**Show build status**

```travis status```

**View build logs**

```travis logs```

**Lint travis.yml**

```travis lint```

**Encrypt secret**

```travis encrypt [SECRET_VAR=value]```

**Add encrypted to yaml**

```travis encrypt [SECRET=value] --add```

**Trigger build**

```travis restart```

# SYNOPSIS

**travis** [_options_] _command_ [_args_]

# PARAMETERS

**login**
> Authenticate with Travis CI using a GitHub token.

**logout**
> Remove stored access token.

**enable**
> Enable Travis CI for a repository.

**disable**
> Disable Travis CI for a repository.

**status**
> Show the build status of the current repository.

**logs**
> Display build logs.

**lint**
> Validate .travis.yml configuration file.

**encrypt** _DATA_
> Encrypt a string for use in .travis.yml.

**encrypt-file** _FILE_
> Encrypt a file for use in the build.

**restart**
> Restart the most recent build.

**cancel**
> Cancel the most recent build.

**env** [_list|set|copy_]
> Manage environment variables.

**whoami**
> Display the current user.

**sync**
> Trigger a sync with GitHub.

**token**
> Display the stored API token.

**--add**
> Add encrypted value to .travis.yml automatically.

**-r**, **--repo** _SLUG_
> Specify repository (owner/name).

**--com**
> Use travis-ci.com API endpoint.

**--pro**
> Shortcut for travis-ci.com (same as --com).

**-t**, **--token** _TOKEN_
> Use a specific access token.

**--debug**
> Display API requests for debugging.

# DESCRIPTION

**travis** is the official command-line client for Travis CI, a continuous integration and deployment service. It provides programmatic access to CI operations including repository management, build monitoring, secret encryption, and configuration validation, all from the terminal.

Authentication is handled through GitHub OAuth tokens, and most operations require being logged in. The CLI can enable or disable CI for repositories, view build status and logs, restart builds, and manage encrypted environment variables. The encrypt command generates per-repository encrypted strings that can be safely committed to version control.

The lint subcommand validates `.travis.yml` configuration files to catch syntax errors and misconfiguration before pushing. The CLI also supports managing caches, viewing branch status, and interacting with the Travis CI API directly.

# CAVEATS

Requires a Travis CI account linked to GitHub. The travis-ci.org endpoint has been shut down; all users must use travis-ci.com (pass **--com** flag). Authentication requires a GitHub OAuth token.

# HISTORY

**Travis CI** was founded in **2011** as a hosted CI service for GitHub. The CLI provides command-line access to CI operations.

# SEE ALSO

[gh](/man/gh)(1), [circleci](/man/circleci)(1)
