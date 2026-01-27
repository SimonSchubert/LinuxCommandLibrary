# TLDR

**Build CSS from input file**

```tailwindcss -i [src/input.css] -o [dist/output.css]```

**Build and watch for changes**

```tailwindcss -i [src/input.css] -o [dist/output.css] --watch```

**Build with minification**

```tailwindcss -i [src/input.css] -o [dist/output.css] --minify```

**Initialize a configuration file**

```tailwindcss init```

**Initialize with full configuration**

```tailwindcss init --full```

**Build using npx**

```npx tailwindcss -i [src/input.css] -o [dist/output.css]```

# SYNOPSIS

**tailwindcss** [_-i input_] [_-o output_] [_--watch_] [_--minify_] [_--config path_]

# PARAMETERS

**-i** _file_, **--input** _file_
> Input CSS file to process

**-o** _file_, **--output** _file_
> Output file for compiled CSS

**-w**, **--watch**
> Watch for changes and rebuild automatically

**-m**, **--minify**
> Minify the output CSS

**-c** _file_, **--config** _file_
> Path to tailwind.config.js file

**--content** _paths_
> Content files to scan for class usage

**-h**, **--help**
> Display help information

# SUBCOMMANDS

**init**
> Create a tailwind.config.js file

**init --full**
> Create configuration with all default values

# DESCRIPTION

**Tailwind CSS** is a utility-first CSS framework that generates optimized CSS by scanning source files for class usage. The CLI compiles Tailwind's utility classes into standard CSS.

The build process scans template files (HTML, JSX, Vue, etc.) for Tailwind classes, generates only the CSS rules actually used, and outputs a production-ready stylesheet. The **--watch** flag enables live rebuilding during development.

Input CSS files should contain Tailwind directives like @tailwind base, @tailwind components, and @tailwind utilities. Configuration is customized via tailwind.config.js.

# CAVEATS

The CLI requires Node.js. For production builds, always use **--minify** to reduce file size. Ensure content paths in configuration correctly point to all template files to avoid missing styles.

# HISTORY

Tailwind CSS was created by **Adam Wathan** and first released in **November 2017**. Version 4 (2024) introduced significant performance improvements with the @tailwindcss/cli package. The framework popularized the utility-first approach to CSS.

# SEE ALSO

[postcss](/man/postcss)(1), [sass](/man/sass)(1), [npm](/man/npm)(1)
