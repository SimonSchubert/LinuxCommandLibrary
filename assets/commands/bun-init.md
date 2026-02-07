# TAGLINE

Scaffold a new project

# TLDR

**Initialize new project interactively**

```bun init```

**Initialize with defaults (skip prompts)**

```bun init -y```

**Initialize React project**

```bun init --react```

**Initialize React with Tailwind**

```bun init --react=tailwind```

**Initialize React with shadcn/ui**

```bun init --react=shadcn```

# SYNOPSIS

**bun init** [_options_]

# DESCRIPTION

**bun init** scaffolds a new Bun project with sensible defaults. It creates essential project files including package.json, tsconfig.json or jsconfig.json, entry point, README, and .gitignore.

The command is non-destructive when run multiple times and will not overwrite existing files.

# PARAMETERS

**-y, --yes**
> Accept defaults without prompting

**--react**
> Scaffold React project (optionally: tailwind, shadcn)

**--cwd** _directory_
> Initialize in different directory

# CREATED FILES

**package.json**
> Project manifest (name defaults to directory name)

**tsconfig.json / jsconfig.json**
> TypeScript/JavaScript configuration

**index.ts**
> Entry point (or index.tsx, index.js, etc.)

**README.md**
> Project documentation

**.gitignore**
> Git ignore patterns

**bun.lockb**
> Lockfile (after install)

# PROJECT STRUCTURE

```
my-project/
├── node_modules/
├── index.ts
├── .gitignore
├── README.md
├── bun.lockb
└── package.json
```

# CAVEATS

Automatically runs **bun install** to install @types/bun. Entry point defaults to index.ts unless other index files exist. TypeScript is preferred by default.

# SEE ALSO

[bun](/man/bun)(1), [bun-create](/man/bun-create)(1), [npm-init](/man/npm-init)(1)
