# TLDR

**Create PWA project**

```pwa create [my-app]```

**Build PWA**

```pwa build```

**Start development server**

```pwa dev```

**Generate service worker**

```pwa sw```

# SYNOPSIS

**pwa** _command_ [_options_]

# DESCRIPTION

**PWA** (Progressive Web App) tools help create web applications that work offline, can be installed, and behave like native apps. Various CLI tools exist for PWA development.

This covers common PWA CLI patterns. Specific tools vary.

# MANIFEST EXAMPLE

```json
{
  "name": "My App",
  "short_name": "App",
  "start_url": "/",
  "display": "standalone",
  "background_color": "#ffffff",
  "theme_color": "#000000",
  "icons": [
    {
      "src": "/icon-192.png",
      "sizes": "192x192",
      "type": "image/png"
    }
  ]
}
```

# SERVICE WORKER

```javascript
// Basic service worker
self.addEventListener('install', (e) => {
  e.waitUntil(
    caches.open('v1').then(cache =>
      cache.addAll(['/'])
    )
  );
});

self.addEventListener('fetch', (e) => {
  e.respondWith(
    caches.match(e.request)
      .then(r => r || fetch(e.request))
  );
});
```

# CAVEATS

HTTPS required for service workers. Browser support varies. Tools differ by framework.

# HISTORY

PWAs were introduced by **Google** in 2015 as a way to deliver app-like experiences through web technology.

# SEE ALSO

[workbox](/man/workbox)(1), [lighthouse](/man/lighthouse)(1), [vite](/man/vite)(1)
