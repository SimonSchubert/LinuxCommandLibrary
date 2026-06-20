# TAGLINE

Publish Markdown and HTML reports to Cloudflare Pages

# TLDR

**Start** the local admin UI

```npx pagecast```

**Set up** a Cloudflare Pages project

```npx pagecast pages setup --project [name]```

**Publish** an HTML or Markdown file

```npx pagecast publish "[/absolute/path/to/report.html]"```

**Publish with** password protection

```npx pagecast publish "[/absolute/path/to/report.html]" --password "[password]"```

**Deploy** a static site directory

```npx pagecast pages deploy "[$(pwd)/dist]" --project [name]```

# SYNOPSIS

**npx pagecast** [_subcommand_] [_options_]

# PARAMETERS

**pages setup**
> Configure a new Cloudflare Pages project

**publish** _file_
> Publish a single HTML or Markdown report to Cloudflare Pages

**pages deploy** _dir_
> Deploy a full static site directory

**--project** _name_
> Cloudflare Pages project name

**--account** _id_
> Cloudflare account ID (for multi-account setups)

**--password** _pass_
> Add password protection to the published page

**--no-password**
> Remove existing password protection from a published page

**--branch** _name_
> Deployment branch name (default: main)

**--json**
> Emit machine-readable JSON output for CI/CD and scripting

# DESCRIPTION

**pagecast** publishes Markdown and HTML reports to the user's own Cloudflare Pages account, making them accessible at a public URL. It provides both a browser-based admin UI (at `http://127.0.0.1:4173`) for managing published links and a CLI interface for automation and CI/CD pipelines.

Password protection can be added or removed per deployment. The `--json` flag enables structured output for agent and scripted workflows.

No global installation is required: `npx pagecast` downloads and runs the package on demand using Node.js.

# CAVEATS

Requires Node.js 20 or later and a Cloudflare account. Paths passed to the `publish` subcommand must be absolute. Cloudflare Pages project setup is a one-time prerequisite before publishing.

# SEE ALSO

[npx](/man/npx)(1), [wrangler](/man/wrangler)(1)

# RESOURCES

```[Source code](https://github.com/Amal-David/pagecast)```

<!-- verified: 2026-06-20 -->
