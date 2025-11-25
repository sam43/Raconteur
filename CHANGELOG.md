
# Change Log
All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](http://keepachangelog.com/)
and this project adheres to [Semantic Versioning](http://semver.org/).

## [Project Directory] - yyyy-mm-dd
This is the root directory for the project changelog.md file. Updated directory structure after changing in the codebase.

```
Raconteur/
 ├─ app/
 │   ├─ build.gradle
 │   ├─ proguard-rules.pro
 │   ├─ src/
 │   │   ├─ main/
 │   │   │   ├─ AndroidManifest.xml
 │   │   │   ├─ kotlin+java/io/raconteur/
 │   │   │   │   ├─ App.kt
 │   │   │   │
 │   │   │   │   ├─ di/
 │   │   │   │   │   ├─ AppModule.kt
 │   │   │   │   │   └─ NetworkModule.kt
 │   │   │   │
 │   │   │   │   ├─ data/
 │   │   │   │   │   ├─ model/
 │   │   │   │   │   │   ├─ Book.kt
 │   │   │   │   │   │   └─ DownloadStatus.kt
 │   │   │   │   │   ├─ local/
 │   │   │   │   │   │   ├─ BookDao.kt
 │   │   │   │   │   │   ├─ BookDatabase.kt
 │   │   │   │   │   │   └─ LocalDataSource.kt
 │   │   │   │   │   ├─ remote/
 │   │   │   │   │   │   ├─ BookApiService.kt
 │   │   │   │   │   │   └─ RemoteDataSource.kt
 │   │   │   │   │   └─ repository/
 │   │   │   │   │       └─ BookRepository.kt
 │   │   │   │
 │   │   │   │   ├─ domain/
 │   │   │   │   │   ├─ usecase/
 │   │   │   │   │   │   ├─ GetBooksUseCase.kt
 │   │   │   │   │   │   ├─ DownloadBookUseCase.kt
 │   │   │   │   │   │   └─ OpenBookUseCase.kt
 │   │   │   │   │   └─ mapper/
 │   │   │   │   │       └─ BookMapper.kt
 │   │   │   │
 │   │   │   │   ├─ ui/
 │   │   │   │   │   ├─ navigation/
 │   │   │   │   │   │   ├─ NavRoutes.kt
 │   │   │   │   │   │   └─ MainNavHost.kt
 │   │   │   │   │   ├─ screens/
 │   │   │   │   │   │   ├─ booklist/
 │   │   │   │   │   │   │   ├─ BookListScreen.kt
 │   │   │   │   │   │   │   ├─ BookListViewModel.kt
 │   │   │   │   │   │   │   └─ BookItemComposable.kt
 │   │   │   │   │   │   ├─ reader/
 │   │   │   │   │   │   │   ├─ BookReaderScreen.kt
 │   │   │   │   │   │   │   └─ BookReaderViewModel.kt
 │   │   │   │   │   │   ├─ components/
 │   │   │   │   │   │   │   ├─ ErrorView.kt
 │   │   │   │   │   │   │   ├─ LoadingView.kt
 │   │   │   │   │   │   │   └─ DownloadButton.kt
 │   │   │   │   │   ├─ theme/
 │   │   │   │   │   │   ├─ Color.kt
 │   │   │   │   │   │   ├─ Type.kt
 │   │   │   │   │   │   ├─ Shape.kt
 │   │   │   │   │   │   └─ Theme.kt
 │   │   │   │   │   ├─ MainActivity.kt
 │   │   │   │   │   └─ UiState.kt
 │   │   │   │
 │   │   │   │   ├─ utils/
 │   │   │   │   │   ├─ FileUtils.kt
 │   │   │   │   │   ├─ NetworkUtils.kt
 │   │   │   │   │   └─ Constants.kt
 │   │   │   │
 │   │   │   │   └─ worker/
 │   │   │   │       ├─ DownloadWorker.kt
 │   │   │   │       └─ WorkerModule.kt
 │   │   │   │
 │   │   │   └─ res/
 │   │   │       ├─ values/
 │   │   │       │   ├─ colors.xml
 │   │   │       │   ├─ themes.xml
 │   │   │       │   └─ strings.xml
 │   │   │       └─ drawable/
 │   │   │           └─ ic_launcher_foreground.xml
 │   │   │
 │   │   ├─ test/
 │   │   │   └─ java/io/raconteur/
 │   │   │       ├─ ExampleUnitTest.kt
 │   │   │       ├─ data/
 │   │   │       │   └─ BookRepositoryTest.kt
 │   │   │       └─ ui/
 │   │   │           ├─ BookListViewModelTest.kt
 │   │   │           └─ DownloadBookUseCaseTest.kt
 │   │   │
 │   │   └─ androidTest/
 │   │       └─ java/io/raconteur/
 │   │           ├─ ComposeUITests.kt
 │   │           ├─ NavigationTest.kt
 │   │           └─ BookReaderScreenTest.kt
 │   │
 │   └─ resources/
 │       └─ mockdata/
 │           └─ sample_books.json
 │
 ├─ build.gradle
 ├─ settings.gradle
 ├─ gradle.properties
 ├─ local.properties
 ├─ CHANGELOG.md
 └─ README.md

```


## [Unreleased] - yyyy-mm-dd

Here we write upgrading notes for brands. It's a team effort to make them as
straightforward as possible.

### Added
- [PROJECTNAME-XXXX](http://tickets.projectname.com/browse/PROJECTNAME-XXXX)
  MINOR Ticket title goes here.
- [PROJECTNAME-YYYY](http://tickets.projectname.com/browse/PROJECTNAME-YYYY)
  PATCH Ticket title goes here.

### Changed

### Fixed

## [1.2.4] - 2017-03-15

Here we would have the update steps for 1.2.4 for people to follow.

### Added

### Changed

- [PROJECTNAME-ZZZZ](http://tickets.projectname.com/browse/PROJECTNAME-ZZZZ)
  PATCH Drupal.org is now used for composer.

### Fixed

- [PROJECTNAME-TTTT](http://tickets.projectname.com/browse/PROJECTNAME-TTTT)
  PATCH Add logic to runsheet teaser delete to delete corresponding
  schedule cards.

## [1.2.3] - 2017-03-14

### Added

### Changed

### Fixed

- [PROJECTNAME-UUUU](http://tickets.projectname.com/browse/PROJECTNAME-UUUU)
  MINOR Fix module foo tests
- [PROJECTNAME-RRRR](http://tickets.projectname.com/browse/PROJECTNAME-RRRR)
  MAJOR Module foo's timeline uses the browser timezone for date resolution 