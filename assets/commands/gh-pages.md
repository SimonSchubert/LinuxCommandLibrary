# TAGLINE

Publish static sites to GitHub Pages branch

# TLDR

**Deploy dist folder to gh-pages**

```npx gh-pages -d [dist]```

**Deploy with custom message**

```npx gh-pages -d [dist] -m "[Deploy to GitHub Pages]"```

**Deploy to custom branch**

```npx gh-pages -d [dist] -b [docs]```

**Deploy specific files**

```npx gh-pages -d [dist] -s "[*.html,*.css]"```

**Deploy with custom remote**

```npx gh-pages -d [dist] -o [upstream]```

**Deploy with a custom domain (CNAME)**

```npx gh-pages -d [dist] --cname [example.com]```

# SYNOPSIS

**gh-pages** [_options_]

# PARAMETERS

**-d**, **--dist** _dir_
> Directory to deploy.

**-s**, **--src** _pattern_
> File pattern within dist.

**-b**, **--branch** _branch_
> Target branch (default: gh-pages).

**-o**, **--remote** _remote_
> Remote name (default: origin).

**-m**, **--message** _msg_
> Commit message.

**-u**, **--user** _name_
> Git user name.

**-e**, **--email** _email_
> Git user email.

**-a**, **--add**
> Add files, don't remove existing.

**-t**, **--dotfiles**
> Include dotfiles.

**-r**, **--repo** _url_
> Repository URL to push to (if not in a git repo or pushing elsewhere).

**--cname** _domain_
> Create a CNAME file with a custom domain name.

**--nojekyll**
> Add .nojekyll file to bypass Jekyll processing on GitHub Pages.

# DESCRIPTION

**gh-pages** is an npm package that publishes files to a GitHub Pages branch. It automates pushing built static sites to the gh-pages branch for hosting, creating clean commits of your distribution folder to the target branch.

The tool makes deployment a single command and is commonly used in CI/CD pipelines and as a package.json script.

# CONFIGURATION

**package.json**
> Configure a deploy script with `"deploy": "gh-pages -d dist"` in the scripts section.

# CAVEATS

Requires git and npm. By default, existing files on the target branch are removed before deploying; use **-a** to preserve them. GitHub Pages repository settings must be configured to serve from the target branch. Use **--nojekyll** for sites that do not need Jekyll processing. Push credentials are required.

# HISTORY

gh-pages was created by **Tim Schaub** to simplify GitHub Pages deployments. It became a standard tool in the JavaScript ecosystem for static site deployment.

# SEE ALSO

[gh](/man/gh)(1), [git](/man/git)(1), [npm](/man/npm)(1)
