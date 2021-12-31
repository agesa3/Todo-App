package com.agesadev.todoapp.di

import android.app.Application
import androidx.room.Room
import androidx.room.RoomDatabase
import com.agesadev.todoapp.data.TodoDatabase
import com.agesadev.todoapp.data.TodoRepository
import com.agesadev.todoapp.data.TodoRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideTodoDatabase(app: Application): TodoDatabase {
        return Room.databaseBuilder(
            app,
            TodoDatabase::class.java,
            "todo_db"
        ).build()
    }

    @Provides
    @Singleton
    fun provideTodoRepository(db: TodoDatabase): TodoRepository {
        return TodoRepositoryImpl(db.dao)
    }

}