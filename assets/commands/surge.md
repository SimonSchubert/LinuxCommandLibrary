# TLDR

**Deploy current directory**

```surge```

**Deploy specific directory**

```surge [./dist]```

**Deploy to custom domain**

```surge [./dist] [mysite.surge.sh]```

**List deployed projects**

```surge list```

**Remove deployment**

```surge teardown [mysite.surge.sh]```

**Login**

```surge login```

**Logout**

```surge logout```

**Show current user**

```surge whoami```

# SYNOPSIS

**surge** [_directory_] [_domain_]

# PARAMETERS

_directory_
> Path to deploy.

_domain_
> Custom domain.

**list**
> Show projects.

**teardown** _DOMAIN_
> Remove project.

**login**
> Authenticate.

**logout**
> Log out.

**whoami**
> Show user.

**token**
> Get auth token.

# DESCRIPTION

**surge** deploys static websites instantly. Free hosting with custom subdomains.

Single command deployment is simple. Point to directory and go.

Custom domains are free. Use *.surge.sh or your own domain.

SSL included automatically. HTTPS for all deployments.

CI/CD integration uses tokens. Automate deployments in pipelines.

# CAVEATS

Static sites only. No server-side code. Free tier has limitations.

# HISTORY

**Surge** was created for simple static site hosting. It provides instant deployment for front-end developers.

# SEE ALSO

[netlify](/man/netlify)(1), [vercel](/man/vercel)(1), [firebase](/man/firebase)(1)
