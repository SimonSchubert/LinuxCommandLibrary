# TAGLINE

Create new GitHub repositories

# TLDR

**Create repo interactively**

```gh repo create```

**Create from current directory**

```gh repo create [name] --source=.```

**Create empty repo**

```gh repo create [name] --public```

**Create private repo**

```gh repo create [name] --private```

**Create from template**

```gh repo create [name] --template [owner/template]```

**Clone after creating**

```gh repo create [name] --clone```

**Create with description**

```gh repo create [name] -d "[description]"```

# SYNOPSIS

**gh** **repo** **create** [_name_] [_options_]

# PARAMETERS

**--public**
> Make public.

**--private**
> Make private.

**--internal**
> Make internal.

**--source** _dir_
> Create from local directory.

**--template** _repo_
> Create from template.

**--clone**
> Clone after creating.

**-d**, **--description** _text_
> Description.

**--homepage** _url_
> Homepage URL.

**--gitignore** _template_
> Add .gitignore.

**--license** _license_
> Add license.

# DESCRIPTION

**gh repo create** creates GitHub repositories from the command line with support for multiple creation workflows. It can create empty repositories, initialize from the current directory, or instantiate from repository templates.

When run interactively without arguments, the command guides you through repository creation with prompts for visibility, description, and initialization options. The --source flag publishes an existing local git repository to GitHub. Template repositories (--template) provide starter configurations for common project types.

# SEE ALSO

[gh-repo](/man/gh-repo)(1), [gh-repo-clone](/man/gh-repo-clone)(1)
