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

**travis** CLI manages Travis CI. It configures and monitors CI/CD.

Login authenticates with GitHub. Required for most operations.

Enable activates CI for repository. Adds webhook for builds.

Encryption protects secrets. Environment variables encrypted per-repo.

Lint validates .travis.yml. Catches configuration errors.

Log viewing shows build output. Debug failed builds.

# CAVEATS

Requires Travis CI account. travis-ci.org shut down. Use travis-ci.com.

# HISTORY

**Travis CI** was founded in **2011** as a hosted CI service for GitHub. The CLI provides command-line access to CI operations.

# SEE ALSO

[gh](/man/gh)(1), [circleci](/man/circleci)(1)
