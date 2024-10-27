//package services;
//
//import models.Diary;
//import repositories.DiaryRepository;
//import repositories.DiaryRepositoryImpl;
//
//public class DiaryServices implements DiaryServicesImpl{
//    DiaryRepositoryImpl diaryRepository = new DiaryRepository();
//    @Override
//    public String registerUser(String userName, String password) {
//        Diary newDiary = new Diary(userName, password);
//        diaryRepository.save(newDiary);
//        return "user registered successfully...";
//    }
//}
