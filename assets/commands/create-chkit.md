# TAGLINE

Scaffold a chkit ClickHouse project from an example

# TLDR

**Create** a project in a new directory (npm, pnpm, Bun, or Yarn)

```npm create chkit@latest [my-app] -- --example hello```

Same flow with the **binary**

```npx create-chkit [my-app] --example hello```

**Skip** dependency install

```create-chkit [my-app] --example hello --skip-install```

Preselect a **database connection** and skip the prompts

```create-chkit [my-app] --example clickbench --connect later --skip-onboarding```

# SYNOPSIS

**create-chkit** [_directory_] [**-e** _name_] [**-m** _npm_|_pnpm_|_yarn_|_bun_] [**--skip-install**] [**--skip-onboarding**] [**--connect** _claim_|_account_|_clickhouse_|_later_] [**--email** _address_] [**--code** _code_] [**--org-name** _name_]

# DESCRIPTION

**create-chkit** scaffolds a new **chkit** project from an example. The npm package name is **create-chkit**, and the program it installs is **create-chkit**. **npm create chkit**, **pnpm create chkit**, **bun create chkit**, and **yarn create chkit** all run that program.

The directory argument is the target. Omit it and the tool asks. **--example** is an example name (**hello**, **clickbench**) or a full GitHub URL. Omit it and the prompt lists the bundled examples with **hello** preselected. **hello** is two small tables and one migration, with no dataset load. **clickbench** is the ClickBench schema and a dataset load.

**--package-manager** forces npm, pnpm, Yarn, or Bun. When it is omitted, the invoking package manager is detected. **--skip-install** leaves dependencies uninstalled. **--skip-onboarding** skips the database connection prompt. **--connect** preselects that prompt: **claim**, **account**, **clickhouse**, or **later**. **--email** and **--code** fill the claim flow so it does not ask. **--org-name** overrides the organization name created for a claim.

After a normal scaffold, the project is a chkit app: schema files, a config, and a migration. Connect it with the same ClickHouse settings **chkit** uses, or claim an ObsessionDB instance from the prompt.

# PARAMETERS

_directory_
> Target directory for the new project. Prompted when omitted

**-e**, **--example** _name_
> Example name or full GitHub URL. Prompted when omitted, with **hello** preselected

**-m**, **--package-manager** _pm_
> **npm**, **pnpm**, **yarn**, or **bun**. Overrides auto-detection

**--skip-install**
> Do not install dependencies after scaffolding

**--skip-onboarding**
> Skip the database connection prompt

**--connect** _choice_
> Preselect the connection: **claim**, **account**, **clickhouse**, or **later**

**--email** _address_
> Email for the claim flow

**--code** _code_
> One-time code for the claim flow

**--org-name** _name_
> Organization name for the auto-created claim, instead of the default

**-v**, **--version**
> Print the create-chkit version

**-h**, **--help**
> Print help

# CAVEATS

Passing extra flags through **npm create** needs **--** before them (**npm create chkit@latest my-app -- --example hello**). **--email** and **--code** are the claim flow's credentials; do not put a real code in a shell history you share. **--skip-install** leaves a project that will not run until dependencies are installed. The example list can grow; the prompt is the list for the version you invoked.

# HISTORY

**create-chkit** is the scaffold package in **obsessiondb/chkit**, MIT-licensed, beside the **chkit** CLI. Package version lines in the repo are **0.2.0-beta** releases.

# SEE ALSO

[chkit](/man/chkit)(1), [npm](/man/npm)(1), [pnpm](/man/pnpm)(1), [yarn](/man/yarn)(1), [bun](/man/bun)(1)

# RESOURCES

```[Source code](https://github.com/obsessiondb/chkit)```

```[Homepage](https://chkit.obsessiondb.com)```

```[Documentation](https://github.com/obsessiondb/chkit/blob/main/packages/create-chkit/README.md)```

<!-- verified: 2026-10-27 -->
