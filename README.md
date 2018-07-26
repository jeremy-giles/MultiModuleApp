# MultiModuleApp
Application with multiple module and  dependency injection

Current error :
```java
C:\Users\jeremy.giles\Documents\Projets\MultipleModuleApp\app\src\main\java\com\project\jeremyg\multimoduledagger\di\AppComponent.java:25: error: [dagger.android.AndroidInjector.inject(T)] java.util.Map<java.lang.Class<? extends android.arch.lifecycle.ViewModel>,javax.inject.Provider<android.arch.lifecycle.ViewModel>> cannot be provided without an @Provides-annotated method.
public interface AppComponent {
       ^
      java.util.Map<java.lang.Class<? extends android.arch.lifecycle.ViewModel>,javax.inject.Provider<android.arch.lifecycle.ViewModel>> is injected at
          com.project.jeremyg.architecture.view_models.ArchitectureViewModelFactory.<init>(creators)
      com.project.jeremyg.architecture.view_models.ArchitectureViewModelFactory is injected at
          com.project.jeremyg.multimoduledagger.ui.fragments.RepoListFragment.architectureViewModelFactory
      com.project.jeremyg.multimoduledagger.ui.fragments.RepoListFragment is injected at
          dagger.android.AndroidInjector.inject(arg0)
2 errors
```