# TLDR

**Start development server**

```vitepress dev [docs]```

**Build for production**

```vitepress build [docs]```

**Preview production build**

```vitepress preview [docs]```

**Initialize new project**

```vitepress init```

**Start in current directory**

```vitepress```

# SYNOPSIS

**vitepress** [_command_] [_root_] [_options_]

# COMMANDS

**dev** _root_: Start development server with hot reload.

**build** _root_: Build static site for production.

**preview** _root_: Preview production build locally.

**init**: Initialize new VitePress project.

# PARAMETERS

_root_
> Project root directory (default: current directory).

**--host** _host_
> Development server host (default: localhost).

**--port** _port_
> Development server port (default: 5173).

**--base** _path_
> Public base path.

**--cors**
> Enable CORS.

**--strictPort**
> Exit if port is in use.

**--force**
> Force optimizer to ignore cache.

**--minify**
> Enable minification (build only).

**--mpa**
> Multi-page app mode.

**-h**, **--help**
> Display help.

**-v**, **--version**
> Display version.

# DESCRIPTION

**VitePress** is a static site generator powered by Vite and Vue.js. It is designed for documentation websites, providing fast development experience with hot module replacement and optimized production builds.

Content is written in Markdown with Vue component support. The tool generates SEO-friendly static HTML pages that hydrate into a single-page application on load.

Configuration is done through a .vitepress/config.js file. Themes can be customized or replaced entirely. Built-in features include navigation, sidebar, search, and dark mode.

VitePress is the spiritual successor to VuePress, rebuilt on top of Vite for improved performance.

Install via npm: `npm add -D vitepress`

# CAVEATS

Requires Node.js 18+. Vue 3 only (not compatible with Vue 2). Custom themes require Vue knowledge. Large sites may have longer build times.

# HISTORY

**VitePress** was created by Evan You (creator of Vue.js and Vite) as a modern replacement for VuePress. It leverages Vite's fast development server and build optimizations. The project is maintained by the Vue.js team.

# SEE ALSO

[vite](/man/vite)(1), [vuepress](/man/vuepress)(1), [hugo](/man/hugo)(1), [jekyll](/man/jekyll)(1)
