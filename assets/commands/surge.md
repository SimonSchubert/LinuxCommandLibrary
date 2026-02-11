# TAGLINE

Instant static website publishing platform

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

**surge** is a static website publishing platform that deploys web projects with a single command. Point it at a directory containing HTML, CSS, JavaScript, and other static assets, and it instantly publishes to a *.surge.sh subdomain or a custom domain.

All deployments include free SSL certificates for HTTPS. Custom domains are supported at no additional cost, requiring only a DNS CNAME record. The platform is designed for front-end developers who need fast, simple hosting without server configuration.

Authentication tokens enable automated deployments in CI/CD pipelines. The list command shows all deployed projects, and teardown removes a deployment. Surge is particularly popular for publishing documentation sites, single-page applications, and project demos.

# CAVEATS

Static sites only. No server-side code. Free tier has limitations.

# HISTORY

**Surge** was created for simple static site hosting. It provides instant deployment for front-end developers.

# SEE ALSO

[netlify](/man/netlify)(1), [vercel](/man/vercel)(1), [firebase](/man/firebase)(1)
