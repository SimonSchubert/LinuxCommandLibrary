# TAGLINE

Scaffold a Vite+ project without a global vp install

# TLDR

**Create** a project with the package manager you already have

```pnpm create vite-plus```

Same flow through **npm**, forwarding flags after **--**

```npm create vite-plus@latest -- [vite:application] --directory [my-app]```

**List** built-in and shorthand templates

```create-vite-plus --list```

Scaffold **without prompts**

```create-vite-plus [vite:library] --no-interactive --directory [my-lib] --package-manager [pnpm]```

# SYNOPSIS

**create-vite-plus** [_template_] [**--directory** _dir_] [**--package-manager** _pnpm_|_npm_|_yarn_|_bun_] [**--agent** _name_] [**--no-agent**] [**--editor** _name_] [**--no-editor**] [**--git** | **--no-git**] [**--hooks** | **--no-hooks**] [**--approve-builds**] [**--no-interactive**] [**--verbose**] [**--list**] [**--** _template-options_]

# DESCRIPTION

**create-vite-plus** scaffolds a new **Vite+** project. The npm package name is **create-vite-plus**, and the program it installs is **create-vite-plus**. **pnpm create vite-plus**, **npm create vite-plus**, **yarn create vite-plus**, and **bun create vite-plus** all run that program. It inserts **create** in front of its arguments and runs the **vite-plus** CLI, so it is **vp create** without a global **vp** binary.

The first argument is the template, not the target directory. Omit it and the tool asks. Built-in templates are **vite:monorepo**, **vite:application**, **vite:library**, and **vite:generator** (a code generator, and only inside a monorepo). Other sources work too: shorthand names (**vite**, **svelte**, **vue**, **next-app**, **nuxt**, **react-router**, **@tanstack/start**), a full package name (**create-vite**, **create-next-app**), a local monorepo generator, or a remote template (**github:user/repo** or an https GitHub URL). **--list** prints the built-in templates and the shorthand names Vite+ recognizes.

**--directory** writes into that directory. Only built-in templates and bundled org templates accept it. **--package-manager** forces npm, pnpm, Yarn, or Bun. When it is omitted, the package manager that launched the command is used, unless the new project is created inside an existing workspace. Arguments after **--** are passed to the template, for example a Vite **--template** choice.

**--agent** and **--editor** write agent instructions and editor config during scaffolding. **--no-agent** and **--no-editor** skip those. **--git** initializes a Git repository. **--hooks** enables the pre-commit hook dispatcher. **--approve-builds** approves and runs gated dependency build scripts without asking, which a non-interactive CI run needs if the template depends on a package with an install script. **--no-interactive** does not prompt. **--verbose** prints the scaffolding detail that a compact run hides.

After a normal scaffold, run **vp** through the same package manager, for example **pnpm exec vp run**.

# PARAMETERS

_template_
> Template to scaffold. Prompted when omitted. A built-in name, a shorthand, a package name, or a remote template

**--directory** _dir_
> Target directory. Built-in templates and bundled org templates only

**--package-manager** _name_
> **pnpm**, **npm**, **yarn**, or **bun**. Overrides the package manager that launched the command

**--agent** _name_
> Write agent instruction files for that agent

**--no-agent**
> Skip agent instruction setup

**--editor** _name_
> Write editor config files for that editor

**--no-editor**
> Skip editor config setup

**--git**
> Initialize a Git repository

**--no-git**
> Do not initialize a Git repository

**--hooks**
> Enable the pre-commit hook dispatcher

**--no-hooks**
> Skip hook setup

**--approve-builds**
> Approve and run gated dependency build scripts without prompting

**--no-interactive**
> Do not prompt. A template is required

**--verbose**
> Print detailed scaffolding output

**--list**
> Print the built-in templates and the popular shorthand templates, then exit

**--** _template-options_
> Arguments after this separator are passed to the selected template

# CAVEATS

Passing flags through **npm create** needs **--** before them (**npm create vite-plus@latest -- vite:application --directory my-app**). The first argument is always the template. **--directory** is rejected for shorthand, package, and remote templates.

**--git** and **--no-git** are rejected when adding a package inside an existing monorepo. **vite:generator** is only for a monorepo.

**--no-interactive** with no template prints usage and exits. Without **--approve-builds**, a non-interactive run does not execute gated install scripts. It lists them and points at **vp pm approve-builds**. pnpm, Bun, Yarn Berry, and npm 12 and newer wait for that approval. npm 11 and older run build scripts during install.

This package does not install the global **vp** binary and does not manage Node.js versions. That is the global CLI (**vp env**, **vp upgrade**).

# HISTORY

**create-vite-plus** is the scaffold package in **voidzero-dev/vite-plus**, MIT-licensed, beside the **vp** CLI. Vite+ is VoidZero's toolchain (Evan You). The public beta shipped on 2 July 2026, and Vite+ 1.0 on 28 September 2026.

# SEE ALSO

[vp](/man/vp)(1), [npm](/man/npm)(1), [pnpm](/man/pnpm)(1), [yarn](/man/yarn)(1), [bun](/man/bun)(1)

# RESOURCES

```[Source code](https://github.com/voidzero-dev/vite-plus)```

```[Homepage](https://viteplus.dev)```

```[Documentation](https://viteplus.dev/guide/create)```

<!-- verified: 2026-10-27 -->
