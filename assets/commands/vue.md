# TAGLINE

Vue.js project management CLI

# TLDR

**Create new project**

```vue create [project-name]```

**Create with preset**

```vue create -p [preset] [project-name]```

**Start GUI**

```vue ui```

**Add plugin**

```vue add [plugin]```

**Invoke generator**

```vue invoke [plugin]```

**Inspect webpack config**

```vue inspect```

**Serve single file**

```vue serve [App.vue]```

**Build single file**

```vue build [App.vue]```

# SYNOPSIS

**vue** _command_ [_options_] [_args_]

# PARAMETERS

**create** _NAME_
> Create project.

**ui**
> Open GUI.

**add** _PLUGIN_
> Add plugin.

**invoke** _PLUGIN_
> Run generator.

**inspect**
> Show webpack config.

**serve** _FILE_
> Dev server.

**build** _FILE_
> Build file.

**-p**, **--preset** _NAME_
> Project preset.

**-d**, **--default**
> Use default preset.

# DESCRIPTION

**vue** is the command-line interface for Vue CLI, providing tools for creating, configuring, and managing Vue.js application projects. It scaffolds new projects with interactive prompts or saved presets, setting up build tooling, linting, testing, and other development infrastructure automatically.

The CLI includes a graphical user interface accessible via `vue ui` for visually managing projects, plugins, dependencies, and build tasks in a browser. Plugins can be added to existing projects to integrate features like Vue Router, Vuex state management, TypeScript support, and testing frameworks.

For rapid prototyping, `vue serve` and `vue build` can compile individual Vue single-file components without requiring a full project setup. The `vue inspect` command displays the resolved webpack configuration, which is helpful for debugging build issues.

# CAVEATS

Vue CLI for Vue 2/3. Vite recommended for new Vue 3. Node.js required.

# HISTORY

**Vue CLI** was created by **Evan You** for Vue.js project management. Version 3+ provides plugin-based architecture.

# SEE ALSO

[npm](/man/npm)(1), [vite](/man/vite)(1), [node](/man/node)(1)
