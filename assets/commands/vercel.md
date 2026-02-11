# TAGLINE

Deploy to Vercel hosting platform

# TLDR

**Deploy project**

```vercel```

**Deploy to production**

```vercel --prod```

**Link local project to Vercel**

```vercel link```

**List deployments**

```vercel ls```

**Show deployment logs**

```vercel logs [deployment_url]```

**Set environment variable**

```vercel env add [VARIABLE_NAME]```

**List environment variables**

```vercel env ls```

**Pull environment variables locally**

```vercel env pull```

# SYNOPSIS

**vercel** [_command_] [_--prod_] [_--yes_] [_options_] [_arguments_]

# PARAMETERS

**(deploy)**
> Deploy project (default command).

**dev**
> Start local development server.

**build**
> Build project locally.

**link**
> Link to Vercel project.

**ls** / **list**
> List deployments.

**logs** _URL_
> Show deployment logs.

**inspect** _URL_
> Show deployment details.

**env** _subcommand_
> Manage environment variables.

**domains** _subcommand_
> Manage domains.

**dns** _subcommand_
> Manage DNS records.

**certs** _subcommand_
> Manage certificates.

**secrets** _subcommand_
> Manage secrets.

**--prod**
> Deploy to production.

**--yes**, **-y**
> Skip confirmation prompts.

**--no-clipboard**
> Don't copy URL to clipboard.

**--local-config** _FILE_
> Local config file path.

**--confirm**
> Confirm default options.

**--scope** _TEAM_
> Team or username scope.

**--token** _TOKEN_
> Auth token.

# DESCRIPTION

**vercel** is the CLI for the Vercel deployment platform. It deploys frontend applications and serverless functions with automatic HTTPS, CDN, and zero configuration.

Deployment is instant - run `vercel` and get a URL. Each deployment is immutable and gets a unique URL. Production deployments update the main domain.

The dev command runs a local development server mimicking Vercel's environment. Serverless functions work locally just as they would deployed.

Framework detection auto-configures builds for Next.js, React, Vue, Angular, and many others. Custom builds use vercel.json configuration.

Environment variables are managed per-environment (development, preview, production). The env pull command downloads them for local use.

Integration with GitHub/GitLab enables automatic preview deployments for pull requests and production deployments on merge.

Domain management handles custom domains, SSL certificates, and DNS configuration through the CLI.

# CAVEATS

Requires Vercel account. Some features need paid plan. Serverless function limits apply. Edge functions have restrictions. Build times count against quotas. Some frameworks need configuration.

# HISTORY

**Vercel** (formerly ZEIT) was founded by **Guillermo Rauch** in **2015**. The CLI was originally `now`, renamed to `vercel` in **2020**. The platform pioneered serverless frontend hosting and is the company behind Next.js. It emphasizes developer experience and zero-configuration deployment.

# SEE ALSO

[netlify](/man/netlify)(1), [firebase](/man/firebase)(1), [surge](/man/surge)(1), [next](/man/next)(1)
