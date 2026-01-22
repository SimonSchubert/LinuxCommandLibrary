# TLDR

**Login to Netlify**

```netlify login```

**Deploy current directory**

```netlify deploy```

**Production deploy**

```netlify deploy --prod```

**Create new site**

```netlify sites:create```

**Open site in browser**

```netlify open```

**View deploy logs**

```netlify watch```

**Link to existing site**

```netlify link```

**Run development server**

```netlify dev```

# SYNOPSIS

**netlify** [_command_] [_options_]

# PARAMETERS

_COMMAND_
> Netlify CLI command.

**login**
> Authenticate with Netlify.

**deploy**
> Deploy site.

**sites:create**
> Create new site.

**open**
> Open in browser.

**dev**
> Start dev server.

**link**
> Link to site.

**--help**
> Display help information.

# DESCRIPTION

**netlify** is the Netlify CLI. It deploys and manages sites on Netlify platform.

The tool handles deployments. Supports serverless functions and local development.

netlify is Netlify deployment CLI.

# CAVEATS

Requires Netlify account. Node.js based. Git integration recommended.

# HISTORY

Netlify CLI was created by **Netlify** to enable command-line deployment and site management.

# SEE ALSO

[vercel](/man/vercel)(1), [firebase](/man/firebase)(1), [gh-pages](/man/gh-pages)(1)

