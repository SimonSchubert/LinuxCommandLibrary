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

**vue** CLI manages Vue.js projects. It creates, configures, and builds apps.

Project creation scaffolds Vue apps. Interactive prompts or presets.

GUI provides visual management. Plugins, dependencies, tasks.

Plugins extend functionality. Router, Vuex, TypeScript, etc.

Single file serving enables prototyping. Quick component development.

Webpack inspection shows configuration. Debug build settings.

# CAVEATS

Vue CLI for Vue 2/3. Vite recommended for new Vue 3. Node.js required.

# HISTORY

**Vue CLI** was created by **Evan You** for Vue.js project management. Version 3+ provides plugin-based architecture.

# SEE ALSO

[npm](/man/npm)(1), [vite](/man/vite)(1), [node](/man/node)(1)
