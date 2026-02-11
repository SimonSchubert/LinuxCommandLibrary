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
> Authenticate.

**enable**
> Enable repo.

**status**
> Build status.

**logs**
> Build logs.

**lint**
> Validate config.

**encrypt** _DATA_
> Encrypt secret.

**restart**
> Restart build.

**--add**
> Add to yaml.

**-r**, **--repo** _SLUG_
> Repository.

# DESCRIPTION

**travis** is the official command-line client for Travis CI, a continuous integration and deployment service. It provides programmatic access to CI operations including repository management, build monitoring, secret encryption, and configuration validation, all from the terminal.

Authentication is handled through GitHub OAuth tokens, and most operations require being logged in. The CLI can enable or disable CI for repositories, view build status and logs, restart builds, and manage encrypted environment variables. The encrypt command generates per-repository encrypted strings that can be safely committed to version control.

The lint subcommand validates `.travis.yml` configuration files to catch syntax errors and misconfiguration before pushing. The CLI also supports managing caches, viewing branch status, and interacting with the Travis CI API directly.

# CAVEATS

Requires Travis CI account. travis-ci.org shut down. Use travis-ci.com.

# HISTORY

**Travis CI** was founded in **2011** as a hosted CI service for GitHub. The CLI provides command-line access to CI operations.

# SEE ALSO

[gh](/man/gh)(1), [circleci](/man/circleci)(1)
